package com.neon.robotarena;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;
public class MainActivity extends Activity {
 private WebView game;
 @Override public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);getWindow().getDecorView().setSystemUiVisibility(5894|1024|512);game=new WebView(this);game.setWebViewClient(new WebViewClient());game.getSettings().setJavaScriptEnabled(true);game.getSettings().setDomStorageEnabled(true);game.setBackgroundColor(0xff050716);setContentView(game);game.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){if(game!=null){game.evaluateJavascript("window.togglePause && window.togglePause()",null);}else super.onBackPressed();}
}
