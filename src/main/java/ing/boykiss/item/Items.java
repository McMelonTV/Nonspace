package ing.boykiss.item;

import com.nodiumhosting.blocksmith.item.Item;
import com.nodiumhosting.blocksmith.text.StyledComponent;
import com.nodiumhosting.blocksmith.text.formatter.SmallCaps;
import ing.boykiss.Nonspace;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextColor;
import net.minestom.server.item.Material;

import java.util.List;

public class Items {
    public static Item UpgradeShard = new Item.Builder()
            .id(Key.key(Nonspace.NAMESPACE, "upgrade_shard"))
            .material(Material.PRISMARINE_SHARD)
            .name(new StyledComponent("Upgrade Shard", Style.empty()))
            .rarity(new StyledComponent("legendary", Style.style(TextColor.fromHexString("#ff8000")), List.of(new SmallCaps())))
            .build();
}
