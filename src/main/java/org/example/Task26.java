package org.example;

public class Task26 {
    /*
    Есть телевизор (TV)

В телевизоре можно хранить набор каналов (Channel).
В каждом канале может быть набор передач (Program).

Есть пуль от телевизора (RemoteController).

Реализовать в пульте метод:

public void on(int channelNumber) - данный метод
позволит показать (напечатать в консоль) случайную передчу
канала с номером channelNumber

В main продемонстрировать работу программу
     */
    public static void main(String[] args) {

        TV tv = new TV("Samsung GQ-Q70BAT");
        RemoteController controller = new RemoteController(tv);
        controller.setOn(true);
        controller.addChannel();
        controller.addChannel();
        controller.on(1);
        controller.setOn(false);
    }
}