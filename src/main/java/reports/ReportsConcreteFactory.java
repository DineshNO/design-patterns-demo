package reports;

import reports.provider_reports.ProviderReportGenerator;
import reports.revenue_reports.RevenueReportGenerator;
import reports.revenue_reports.Sony;
import reports.revenue_reports.Universal;

public class ReportsConcreteFactory extends ReportsAbstractFactory {

    @Override
    public ProviderReportGenerator generateMarketShare(String provider) {
        return switch (provider) {
            case "Universal" -> new reports.provider_reports.Universal();
            case "Sony" -> new reports.provider_reports.Sony();
            default -> null;
        };
    }

    @Override
    public RevenueReportGenerator generateRevenue(String provider) {
        return switch (provider) {
            case "Universal" -> new Universal();
            case "Sony" -> new Sony();
            default -> null;
        };
    }

    @Override
    public RevenueReportGenerator generateDummyReport(String provider) {
        return null;
    }
}
