package space.lvyang.springboot;

import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/***
 * zookeepeer test
 * */
public class ZkTest {
    public static void main(String[] args) {
        initZk();
    }
    /**
     * link test
     * */
    public static void initZk(){
        String CONNECT_ADDR = "192.168.1.25:2181";
        try {
            ZooKeeper zk = new ZooKeeper(CONNECT_ADDR,2000,null);
            System.out.println("run zk sucess" +zk);
            Thread.sleep(100000);
        } catch (Exception e) {
            System.out.println("exception:"+e.getMessage());
            e.printStackTrace();
        }


    }
}
