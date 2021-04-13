package org.si.gozero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class ReportActivity extends AppCompatActivity {

    AnyChartView anyChartView;

    String[] months = {"Perbaikan", "Pencegahan"};
    int[] earnings = {14, 86};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        anyChartView = findViewById(R.id.chart);

        setupPieChart();
    }

    private void setupPieChart() {

        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>();
        
        for( int i = 0; i < months.length; i++) {
            dataEntries.add(new ValueDataEntry(months[i], earnings[i]));
        }

        pie.data(dataEntries);
        pie.title("Corrective Inspection");
        anyChartView.setChart(pie);
    }
}