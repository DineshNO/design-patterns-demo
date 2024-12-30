package reports.provider_reports;

import reports.ReportsAbstractFactory;
import reports.ReportsConcreteFactory;

public class ProviderReports {
    public static void main(String[] args) {
        ReportsAbstractFactory reportsAbstractFactory = new ReportsConcreteFactory();
        ProviderReportGenerator providerReportGenerator = reportsAbstractFactory.generateMarketShare("Sony");
        providerReportGenerator.generateMarkerShare();
    }
}
