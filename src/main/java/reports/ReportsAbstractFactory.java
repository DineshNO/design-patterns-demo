package reports;

import reports.provider_reports.ProviderReportGenerator;
import reports.revenue_reports.RevenueReportGenerator;

public abstract class ReportsAbstractFactory {
    public abstract ProviderReportGenerator generateMarketShare(String provider);
    public abstract RevenueReportGenerator generateRevenue(String provider);
    public abstract RevenueReportGenerator generateDummyReport(String provider);
}
