package kata3;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    public HistogramDisplay (String tittle){
        super(tittle);
        setContentPane(createPanel());
        pack();
    }
    
    private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(
                "Histo",
                "Dominios",
                "Nº Email",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "ENE", "gmail.com");
        dataset.addValue(7, "ENE", "hotmail.com");
        dataset.addValue(10, "ENE", "ulpgc.es");
        
        dataset.addValue(30, "FEB", "gmail.com");
        dataset.addValue(5, "FEB", "hotmail.com");
        dataset.addValue(8, "FEB", "ulpgc.es");
        
        return dataset;
    }
    
    public void execute(){
        setVisible(true);
    }
}
