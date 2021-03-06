package dyslexia.app.ui.permainan.kuis.skor.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.List;

import dyslexia.app.R;
import dyslexia.app.repositories.database.entities.ScoreEntity;
import dyslexia.app.ui.permainan.kuis.adapter.ScoreAdapter;
import dyslexia.app.services.AccountService;
import dyslexia.app.services.ScoreService;
import dyslexia.app.services.UserService;
import dyslexia.app.utils.Constant;


public class NominaFragment extends Fragment {
    ListView listView;
    TextView textView;
    List<ScoreEntity> scoreEntityList;
    ScoreAdapter adapter;

    public static NominaFragment newInstance() {
        return new NominaFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_score, null);
        initializeViews(rootView);
        loadData();
        return rootView;
    }

    private void loadData() {
        scoreEntityList = ScoreService.getCurrentScoreBenda(getContext());
        Log.d(Constant.TAG, "loadData: " + scoreEntityList);
        Log.d(Constant.TAG, "userID: " + AccountService.getUserId(getContext()));
        Log.d(Constant.TAG, "users: " + UserService.getUsers(getContext()));
        adapter = new ScoreAdapter(getContext(), 0, scoreEntityList);
        listView.setAdapter(adapter);
    }

    private void initializeViews(View rootView) {
        listView = rootView.findViewById(R.id.list);
        textView = rootView.findViewById(R.id.title_name);
        textView.setText(toString());
    }

    @Override
    public String toString() {
        return "Kata Benda";
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
