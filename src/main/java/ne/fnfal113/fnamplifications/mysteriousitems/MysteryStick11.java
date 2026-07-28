package ne.fnfal113.fnamplifications.mysteriousitems;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.Getter;
import ne.fnfal113.fnamplifications.mysteriousitems.abstracts.AbstractStick;
import ne.fnfal113.fnamplifications.utils.Keys;
import ne.fnfal113.fnamplifications.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.HashMap;
import java.util.Map;

public class MysteryStick11 extends AbstractStick {

    @Getter
    private final Material material;

    @ParametersAreNonnullByDefault
    public MysteryStick11(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, Material material) {
        super(itemGroup, item, recipeType, recipe, Keys.STICK_11_EXP_LEVELS, Keys.STICK_11_DAMAGE, 4, 25);

        this.material = material;
    }

    @Override
    public Map<Enchantment, Integer> enchantments(){
        Map<Enchantment, Integer> enchantments = new HashMap<>();
        enchantments.put(Enchantment.BANE_OF_ARTHROPODS, 10);
        enchantments.put(Enchantment.SHARPNESS, 7);
        enchantments.put(Enchantment.SMITE, 8);
        enchantments.put(Enchantment.KNOCKBACK, 2);

        return enchantments;
    }

    @Override
    public String weaponLore(){
        return ChatColor.GOLD + "O perigo espreita atrás do seu inimigo";
    }

    @Override
    public String stickLore(){
        return ChatColor.WHITE + "O bastão dos nórdicos";
    }

    @Override
    public Material getStickMaterial() {
        return getMaterial();
    }

    @Override
    public void onSwing(EntityDamageByEntityEvent event){
        Player player = (Player) event.getDamager();
        ItemStack item = player.getInventory().getItemInMainHand();

        if(item.getType() != getMaterial()){
            return;
        }

        if(getStickTask().onSwing(item, player, event.getDamage(), 13, 4)) {
            LivingEntity victim = (LivingEntity) event.getEntity();
            victim.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 80, 2, false, true, false));
            victim.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 80, 2, false, true, false));
            victim.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 100, 2, false, true, false));

            Location loc = victim.getLocation();
            loc.setYaw(loc.getYaw() + 180);
            victim.teleport(loc);
            victim.sendMessage(ChatColor.DARK_RED + "Você perdeu o rumo! O bastão do seu adversário é extremamente letal");
            player.sendMessage(Utils.colorTranslator("&cO efeito mágico foi aplicado ao seu inimigo"));
        }

    }
}