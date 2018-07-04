/**
 * Author:   shitian
 * Date:     2018/7/4 15:31
 * Description:
 */
package com.rocky.design.build;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈导演类，封装所有建造车模的业务逻辑（即顺序）〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class Director {
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    private List<String> sequence = new ArrayList<>();

    public CarModel getABenzModel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return benzBuilder.getCarModel();
    }

    public CarModel getBBenzModel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return benzBuilder.getCarModel();
    }

    public CarModel getABMWModel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return bmwBuilder.getCarModel();
    }

    public CarModel getBBMWModel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("engineBoom");
        sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return bmwBuilder.getCarModel();
    }

}
