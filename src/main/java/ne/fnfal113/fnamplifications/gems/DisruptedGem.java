package ne.fnfal113.fnamplifications.gems;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.fnamplifications.gems.abstracts.AbstractGem;
import ne.fnfal113.fnamplifications.gems.events.GuardianSpawnEvent;
import ne.fnfal113.fnamplifications.gems.handlers.GemUpgrade;
import ne.fnfal113.fnamplifications.gems.handlers.OnGuardianSpawnHandler;
import ne.fnfal113.fnamplifications.utils.WeaponArmorEnum;
import ne.fnfal113.fnamplifications.utils.Utils;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.concurrent.ThreadLocalRandom;

public class DisruptedGem extends AbstractGem implements OnGuardianSpawnHandler, GemUpgrade {

    public DisruptedGem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe, 17);
    }

    @Override
    public void onDrag(Player player, SlimefunItem slimefunGemItem, ItemStack gemItem, ItemStack itemStackToSocket){
        if ((WeaponArmorEnum.SWORDS.isTagged(itemStackToSocket.getType()))) {
            if(isUpgradeGem(gemItem, this.getId())) {
                upgradeGem(slimefunGemItem, itemStackToSocket, gemItem, player);
            } else {
                bindGem(slimefunGemItem, itemStackToSocket, player);
            }
        } else {
            player.sendMessage(Utils.colorTranslator("&eEste item não pode ser vinculado! Esta gema só pode ser vinculada em espada"));
        }
    }

    @Override
    public void onGuardianSpawn(GuardianSpawnEvent event, ItemStack itemStack){
        if(event.isCancelled()){
            return;
        }

        if(ThreadLocalRandom.current().nextInt(100) < getChance() / getTier(itemStack, this.getId())){
            event.setCancelled(true);
            event.getDamager().sendMessage(Utils
                    .colorTranslator("&eVocê perturbou o guardião do inimigo com sucesso, ele não será invocado"));
            event.getGuardianOwner().sendMessage(Utils
                    .colorTranslator("&6Seu guardião foi perturbado pelo jogador que te atacou, ele não será invocado!"));
            event.getGuardianOwner().playSound(event.getGuardianOwner().getLocation(), Sound.ENTITY_ZOMBIE_DEATH, 1.0F, 1.0F);
        }
    }

}