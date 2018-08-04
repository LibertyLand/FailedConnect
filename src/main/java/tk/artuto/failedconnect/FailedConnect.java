/*    */ package tk.artuto.failedconnect;
/*    */ 
/*    */ import java.util.logging.Logger;
/*    */ import net.md_5.bungee.api.ProxyServer;
/*    */ import net.md_5.bungee.api.plugin.Plugin;
/*    */ import net.md_5.bungee.api.plugin.PluginManager;
/*    */ 
/*    */ 
/*    */ public class FailedConnect
/*    */   extends Plugin
/*    */ {
/*    */   public void onEnable()
/*    */   {
/* 14 */     getLogger().info("FailedConnect - Enabled");
/* 15 */     getProxy().getPluginManager().registerListener(this, new EventListener());
/*    */   }
/*    */   
/*    */ 
/*    */   public void onDisable()
/*    */   {
/* 21 */     getLogger().info("FailedConnect - Disabled");
/*    */   }
/*    */ }


/* Location:              C:\Users\artut\Google Drive\LL18\pl\Bungee\failedconnect-1.0-SNAPSHOT.jar!\tk\artuto\failedconnect\FailedConnect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */