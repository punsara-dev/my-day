// Generated by view binder compiler. Do not edit!
package com.example.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todoapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCreate;

  @NonNull
  public final EditText editTextconfirmpw;

  @NonNull
  public final EditText editTextemail;

  @NonNull
  public final EditText editTextpw;

  @NonNull
  public final EditText editUserName;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView text4;

  @NonNull
  public final TextView textlogin;

  private ActivitySignUpScreenBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCreate,
      @NonNull EditText editTextconfirmpw, @NonNull EditText editTextemail,
      @NonNull EditText editTextpw, @NonNull EditText editUserName, @NonNull ImageView imageView2,
      @NonNull TextView text4, @NonNull TextView textlogin) {
    this.rootView = rootView;
    this.btnCreate = btnCreate;
    this.editTextconfirmpw = editTextconfirmpw;
    this.editTextemail = editTextemail;
    this.editTextpw = editTextpw;
    this.editUserName = editUserName;
    this.imageView2 = imageView2;
    this.text4 = text4;
    this.textlogin = textlogin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCreate;
      Button btnCreate = ViewBindings.findChildViewById(rootView, id);
      if (btnCreate == null) {
        break missingId;
      }

      id = R.id.editTextconfirmpw;
      EditText editTextconfirmpw = ViewBindings.findChildViewById(rootView, id);
      if (editTextconfirmpw == null) {
        break missingId;
      }

      id = R.id.editTextemail;
      EditText editTextemail = ViewBindings.findChildViewById(rootView, id);
      if (editTextemail == null) {
        break missingId;
      }

      id = R.id.editTextpw;
      EditText editTextpw = ViewBindings.findChildViewById(rootView, id);
      if (editTextpw == null) {
        break missingId;
      }

      id = R.id.editUserName;
      EditText editUserName = ViewBindings.findChildViewById(rootView, id);
      if (editUserName == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.text4;
      TextView text4 = ViewBindings.findChildViewById(rootView, id);
      if (text4 == null) {
        break missingId;
      }

      id = R.id.textlogin;
      TextView textlogin = ViewBindings.findChildViewById(rootView, id);
      if (textlogin == null) {
        break missingId;
      }

      return new ActivitySignUpScreenBinding((ConstraintLayout) rootView, btnCreate,
          editTextconfirmpw, editTextemail, editTextpw, editUserName, imageView2, text4, textlogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
