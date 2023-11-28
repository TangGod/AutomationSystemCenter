package tanggod.github.io.webdriver.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by TangGod on 2019/1/17.
 */
public class MyTimerTask {

    public static void main(String[] args) {

        MyTimerTask.task(() -> {
            System.out.println("我是任务");
        });
    }

    public static void task(Runnable runnable) {

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                runnable.run();
                System.out.println("task  run:" + new Date());
            }
        };
        Timer timer = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。这里是每10分钟执行一次
        timer.schedule(timerTask, 10, 60 * 1 * 10);
    }
}
