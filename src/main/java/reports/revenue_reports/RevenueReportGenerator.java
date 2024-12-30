package reports.revenue_reports;

public sealed interface RevenueReportGenerator permits Universal, Sony {
    void generateRevenue();
}
