// Generated by view binder compiler. Do not edit!
package com.bluetooth.communicatorexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.bluetooth.communicatorexample.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ComponentMessageSendBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView card;

  @NonNull
  public final TextView text;

  private ComponentMessageSendBinding(@NonNull RelativeLayout rootView, @NonNull CardView card,
      @NonNull TextView text) {
    this.rootView = rootView;
    this.card = card;
    this.text = text;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ComponentMessageSendBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ComponentMessageSendBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.component_message_send, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ComponentMessageSendBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card;
      CardView card = rootView.findViewById(id);
      if (card == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = rootView.findViewById(id);
      if (text == null) {
        break missingId;
      }

      return new ComponentMessageSendBinding((RelativeLayout) rootView, card, text);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}