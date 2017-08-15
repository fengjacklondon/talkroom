package talkroom.fxh.application.user;
import gnu.trove.map.hash.TIntObjectHashMap;
import talkroom.fxh.connector.Connector;

/**
 * 保存用户相关状态
 * 连接状态
 *
 * <p>Copyright: Jdon.com Copyright (c) 2003</p>
 * <p>Company: 上海解道计算机技术有限公司</p>
 * @author banq
 * @version 1.0
 */
public class UserPool {

   private static UserPool userPool = new UserPool();
   public static UserPool getIntance(){
      return userPool;
   }

   private final static TIntObjectHashMap users = new TIntObjectHashMap();

   public synchronized void save(int userID, Connector connector) {
      users.put(userID, connector);
   }

   public synchronized Connector load(int userID){
      return (Connector)users.get(userID);
   }




}