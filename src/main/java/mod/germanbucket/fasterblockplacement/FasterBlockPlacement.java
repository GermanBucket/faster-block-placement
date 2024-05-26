package mod.germanbucket.fasterblockplacement;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FasterBlockPlacement.MODID)
public class FasterBlockPlacement {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "fasterblockplacement";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    public FasterBlockPlacement() {
    }
}
