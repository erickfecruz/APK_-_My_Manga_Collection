package com.cruz.erick.mymangacollection.EditoraActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.cruz.erick.mymangacollection.R;

public class Fragmento4 extends Fragment {

    WebView mWebView;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View x = inflater.inflate(R.layout.layout_fragmento2, container, false);
        mWebView = (WebView) x.findViewById(R.id.my_webview);

        String url = "https://www.editoranovasampa.com.br/";
        // probably a good idea to check it's not null, to avoid these situations:
        if (mWebView != null) {
            mWebView.loadUrl(url);
            mWebView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
            });
        }

        return x;
    }
}
