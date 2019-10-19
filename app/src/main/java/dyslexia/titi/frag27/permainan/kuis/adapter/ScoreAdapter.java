package dyslexia.titi.frag27.permainan.kuis.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


import androidx.annotation.NonNull;
import dyslexia.titi.frag27.R;
import dyslexia.titi.frag27.database.entities.ScoreEntity;

public class ScoreAdapter  extends ArrayAdapter<ScoreEntity> {

    private Context mContext;
    private List<ScoreEntity> listScore;

    public ScoreAdapter( Context context, int resource, List<ScoreEntity> objects) {
        super(context, R.layout.item_view_score, objects);
        this.mContext = context;
        this.listScore = objects;

    }

    private static int latestNumber = 0;

    public int getNumber(){
        return ++latestNumber;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_view_score, null);

            ScoreEntity scoreEntity = getItem(position);
            //ScoreEntity scoreEntityID = listScore.get(position);



            //TextView type = convertView.findViewById(R.id.quiz_type);
            TextView id = convertView.findViewById(R.id.tv_id);
            TextView score = convertView.findViewById(R.id.score);
            TextView createAt = convertView.findViewById(R.id.createdAt);

            //type.setText(scoreEntity.getQuizType());
            //id.setText(String.valueOf(getNumber()));
            score.setText(String.valueOf(scoreEntity.getScore()));
            createAt.setText(scoreEntity.getCreatedAt());

        }

        return convertView;
    }


}
