
package com.example.lucia.cursospoint;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuItem;

import com.example.lucia.cursospoint.Adapter.CourseAdapter;
import com.example.lucia.cursospoint.bd.Courses;

public class CourseActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public LinearLayoutManager linearLayout;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        setToolbar(); // Reemplazar toolbar

        setupRecyclerView(); // Preparar recycler view

        setupWindowAnimations(); // Añadir animaciones
    }

    private void setupRecyclerView() {
        linearLayout = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.reciclador);
        recyclerView.setLayoutManager(linearLayout);
        CourseAdapter adapter = new CourseAdapter(this, Courses.getCourses());
        recyclerView.setAdapter(adapter);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupWindowAnimations() {
        getWindow().setReenterTransition(new Explode());
        getWindow().setExitTransition(new Explode().setDuration(500));
    }

 //   @Override
 //   public boolean onCreateOptionsMenu(Menu menu) {
 //       getMenuInflater().inflate(R.menu.menu_course, menu);
 //       return true;
 //   }

 //   @Override
 //   public boolean onOptionsItemSelected(MenuItem item) {
 //       int id = item.getItemId();
 //       if (id == R.id.action_settings) {
 //           return true;
 //       }
 //       return super.onOptionsItemSelected(item);
 //   }
}
