package org.training.java.advanced.intf;

public class HelloFactory {

    public static IHello createHelloImpl(int index) {
        IHello hello = null;
        switch (index) {
            case 1:
                hello = new HelloEng();
                break;
            case 2:
                hello = new HelloTr();
                break;
            case 3:
                hello = new HelloEsp();
                break;
            case 4:
                hello = new HelloJp();
                break;
            default:
                hello = new HelloEng();
                break;
        }
        return hello;
    }

    public static String getMenu() {
        // String menuStr = "1-İngilizce\n" + "2-Türkçe\n" + "3-İspanyolca\n" + "Seçiminiz\n";
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("1-İngilizce\n");
        stringBuilder.append("2-Türkçe\n");
        stringBuilder.append("3-İspanyolca\n");
        stringBuilder.append("Seçiminiz\n");
//        String str = "str";
//        for (int i = 0; i < 100; i++) {
//            str += " " + i;
//        }

//        String menuStr = "1-İngilizce\n";
//        menuStr += "2-Türkçe\n";
//        menuStr += "3-İspanyolca\n";
//        menuStr += "Seçiminiz\n";
//        String concat = menuStr.concat("2-Türkçe\n").concat("3-İspanyolca\n");
        return stringBuilder.toString();
    }

}
