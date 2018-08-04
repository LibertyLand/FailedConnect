/*    */ package tk.artuto.failedconnect;
/*    */ 
/*    */ import net.md_5.bungee.api.config.ServerInfo;
/*    */ import net.md_5.bungee.api.connection.ProxiedPlayer;
/*    */ import net.md_5.bungee.api.connection.Server;
/*    */ import net.md_5.bungee.api.event.ServerKickEvent;
/*    */ import net.md_5.bungee.api.plugin.Listener;
/*    */ import net.md_5.bungee.event.EventHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EventListener
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onServerKick(ServerKickEvent event)
/*    */   {
/* 18 */     ProxiedPlayer player = event.getPlayer();
/* 19 */     ServerInfo start = player.getServer().getInfo();
/*    */     
/* 21 */     if (start.getName().equals("auth")) {
/* 22 */       player.disconnect(event.getKickReasonComponent());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\artut\Google Drive\LL18\pl\Bungee\failedconnect-1.0-SNAPSHOT.jar!\tk\artuto\failedconnect\EventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */