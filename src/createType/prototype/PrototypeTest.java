package createType.prototype;

import createType.prototype.elf.ElfBeast;
import createType.prototype.elf.ElfMage;
import createType.prototype.elf.ElfWarlord;
import createType.prototype.orc.OrcBeast;
import createType.prototype.orc.OrcMage;
import createType.prototype.orc.OrcWarlord;

public class PrototypeTest {
    public static void main(String[] args) {
        HeroFactory factory;
        Mage mage;
        Warlord warlord;
        Beast beast;

        factory = new HeroFactoryIml(new ElfMage(), new ElfWarlord(), new ElfBeast());
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeact();
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());

        System.out.println("--------------------------");

        factory = new HeroFactoryIml(new OrcMage(), new OrcWarlord(), new OrcBeast());
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeact();
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());
    }
}
