package dxm.biological;

import net.minecraft.util.DamageSource;

public class BioSpawnDamageSource extends DamageSource {
    public static DamageSource OD = new BioSpawnDamageSource("overdose").setDamageBypassesArmor();

    protected BioSpawnDamageSource(String name) {
        super(name);
    }
}