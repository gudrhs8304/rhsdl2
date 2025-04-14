package ch_08_class_ex.ex06;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.channel = 100;
        tv.volume = 0;
        System.out.println("CH: " + tv.channel + ", VOL: " + tv.volume); // CH:100, VOL:0

        tv.channelDown();
        tv.volumeDown();
        System.out.println("CH: " + tv.channel + ", VOL: " + tv.volume); // CH:99, VOL:0

        tv.volume = 100;
        tv.channelUp();
        tv.volumeUp();
        System.out.println("CH: " + tv.channel + ", VOL: " + tv.volume); // CH:100, VOL:100

    }
}
