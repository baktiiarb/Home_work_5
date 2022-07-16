public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealsBoss(20);
        boss.setDamageBoss(35);
        boss.setProtectionTypeBoss("rasengan");
        System.out.println("heals boss = " + boss.getHealsBoss());
        System.out.println("damage boss = " + boss.getDamageBoss());
        System.out.println("setProtectionTypeBoss = " + boss.getProtectionTypeBoss());
        
    }




    }
