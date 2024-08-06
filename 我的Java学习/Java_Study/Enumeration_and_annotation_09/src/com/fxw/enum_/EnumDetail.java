package com.fxw.enum_;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSMUSIC.play();
    }
}


class A {

}

interface IPlaying {
    void play();
}

enum Music implements IPlaying {
    CLASSMUSIC;

    @Override
    public void play() {
        System.out.println("播放好听的音乐.....");
    }
}