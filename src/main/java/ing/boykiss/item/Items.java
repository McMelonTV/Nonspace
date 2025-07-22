package ing.boykiss.item;

import com.nodiumhosting.blocksmith.item.Item;
import com.nodiumhosting.blocksmith.text.StyledComponent;
import com.nodiumhosting.blocksmith.text.formatter.SmallCaps;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextColor;
import net.minestom.server.item.Material;

import java.util.List;

public class Items {
    public Item Stick = new Item.Builder()
            .id("stick")
            .material(Material.STICK)
            .name("Stick")
            .rarity(new StyledComponent("legendary", Style.style(TextColor.fromHexString("#FFD700")), List.of(new SmallCaps())))
            .itemModel("stick")
            .build();
}
