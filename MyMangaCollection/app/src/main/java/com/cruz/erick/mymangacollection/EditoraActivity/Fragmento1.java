package com.cruz.erick.mymangacollection.EditoraActivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.cruz.erick.mymangacollection.R;

/**
 * Propósito - criar um fragmento de modo que haja nele elementos de interação
 * (botoes)
 * Problema - pode-se associar ao XML o método do onClick, porém este método deve
 * ficar na MainActivity (fora do Fragmento). Isso pode não parecer elegante
 * do ponto de vista de boa organização do código.
 *
 * Como proceder? Inflar o layout, buscar o elemento (botão, por exemplo) e,
 * assim, criar um Listener para ele poder ter a lógica associada.
 */
public class Fragmento1 extends Fragment {

    WebView mWebView;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View x = inflater.inflate(R.layout.layout_fragmento2, container, false);
        mWebView = (WebView) x.findViewById(R.id.my_webview);

        String url = "http://mangasjbc.com.br/";
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
