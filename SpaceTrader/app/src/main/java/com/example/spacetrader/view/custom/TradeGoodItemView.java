package com.example.spacetrader.view.custom;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.spacetrader.R;
import com.example.spacetrader.view.fragment.BuySellFragment;
import com.example.spacetrader.viewmodel.BuySellViewModel;

public class TradeGoodItemView extends ConstraintLayout {

    TextView itemNameTextView;
    TextView itemDescriptionTextView;
    Button buyButton;

    public TradeGoodItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TradeGoodItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.tradegood_item_view, this);

        itemNameTextView = findViewById(R.id.itemName);
        itemDescriptionTextView = findViewById(R.id.itemStatus);
        buyButton = findViewById(R.id.buyButton);
    }

    public void setAttributes(String itemName, int price, int amount, String buttonText, String suffixText) {
        itemNameTextView.setText(itemName);
        itemDescriptionTextView.setText(String.format(getResources().getString(R.string.shop_item_status) + " " + suffixText, price, amount));
        buyButton.setText(buttonText);
    }

    public Button getActionButton() {
        return buyButton;
    }
}
