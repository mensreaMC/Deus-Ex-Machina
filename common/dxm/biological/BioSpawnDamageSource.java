package dxm.biological;

import net.minecraft.util.DamageSource;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class BioSpawnDamageSource extends DamageSource
{
    public static DamageSource OD = new BioSpawnDamageSource("overdose").setDamageBypassesArmor();

    protected BioSpawnDamageSource(String par1Str)
    {
        super(par1Str);
    }

    public static void localize()
    {
        LanguageRegistry.instance().addStringLocalization("death.overdose", "%1$s overdosed");
    }
}