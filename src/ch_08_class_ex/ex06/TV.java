package ch_08_class_ex.ex06;

public class TV {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        /* (1) isPowerOn의 값을 true를 false로, false를 true로 변경. */
        isPowerOn = !isPowerOn;
    }
    void volumeUp() {
        /* (2) volume의 값을 MAX_VOLUME보다 낮을 경우에는 1 증가. */
//        if (volume < MAX_VOLUME){
//            volume ++;
//        }
        volume = (MAX_VOLUME > volume) ? volume + 1 : volume;
    }
    void volumeDown() {
        /* (3) volume의 값을 MIN_VOLUME보다 높을 경우에는 1 감소. */
//        if(volume > MIN_VOLUME) {
//            volume --;
//        }
        volume = (MIN_VOLUME < volume) ? volume - 1 : volume;
    }
    void channelUp() {
        /* (4) channel의 값을 1증가. MAX_CHANNEL 보다 올라 갈수 없음. */
//        if(channel < MAX_CHANNEL) {
//            channel++;
//        }
        channel = (MAX_CHANNEL > channel) ? channel + 1 : channel;
    }

    void channelDown() {
        /* (5) channel의 값을 1감소. MIN_CHANNEL 보다 내려 갈수 없음. */
//        if(channel > MIN_CHANNEL) {
//            channel --;
//        }
        channel = (MIN_CHANNEL < channel) ? channel - 1 : channel;
    }
}
