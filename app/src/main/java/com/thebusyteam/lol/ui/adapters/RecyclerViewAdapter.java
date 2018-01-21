package com.thebusyteam.lol.ui.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thebusyteam.lol.R;
import com.thebusyteam.lol.dummy.DummyContent;
import com.thebusyteam.lol.ui.JokeDetailActivity;
import com.thebusyteam.lol.ui.JokeDetailFragment;
import com.thebusyteam.lol.ui.JokeListActivity;

import java.util.List;

/**
 * Created by MT on 06-Jan-18.
 */


    public class RecyclerViewAdapter
            extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private final JokeListActivity mParentActivity;
        private final List<DummyContent.DummyItem> mValues;
        private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DummyContent.DummyItem item = (DummyContent.DummyItem) view.getTag();

                    Context context = view.getContext();
                    Intent intent = new Intent(context, JokeDetailActivity.class);
                    intent.putExtra(JokeDetailFragment.ARG_ITEM_ID, item.id);

                    context.startActivity(intent);

            }
        };

        public RecyclerViewAdapter(JokeListActivity parent,
                                   List<DummyContent.DummyItem> items) {
            mValues = items;
            mParentActivity = parent;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.joke_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            holder.mIdView.setText(mValues.get(position).id);
            holder.mContentView.setText(mValues.get(position).content);

            holder.itemView.setTag(mValues.get(position));
            holder.itemView.setOnClickListener(mOnClickListener);
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final TextView mIdView;
            final TextView mContentView;

            ViewHolder(View view) {
                super(view);
                mIdView = (TextView) view.findViewById(R.id.id_text);
                mContentView = (TextView) view.findViewById(R.id.content);
            }
        }
    }

