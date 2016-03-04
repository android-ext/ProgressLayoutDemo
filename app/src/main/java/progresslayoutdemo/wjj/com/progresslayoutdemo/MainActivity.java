package progresslayoutdemo.wjj.com.progresslayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @Bind(R.id.recyclerView) RecyclerView recyclerView;

    private RecylerListAdapter recylerListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        /**
         * 初始化适配器
         */
        recylerListAdapter = new RecylerListAdapter();
        recyclerView.setAdapter(recylerListAdapter);
        loadMockData();
    }

    /**
     * 填充数据
     */
    private void loadMockData() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track(1, "第一行标题", "第一行内容", 81));
        tracks.add(new Track(2, "第二行标题", "第二行内容", 395));
        tracks.add(new Track(3,"第三行标题", "第三行内容", 24));
        tracks.add(new Track(4, "第四行标题", "第四行内容", 53));
        tracks.add(new Track(5, "第五行标题", "第五行内容", 28));
        tracks.add(new Track(6, "第六行标题", "第六行内容", 19));
        tracks.add(new Track(7, "第七行标题", "第七行内容", 5));
        tracks.add(new Track(8, "第八行标题", "第八行内容", 223));
        recylerListAdapter.setTrackList(tracks);
    }
}
