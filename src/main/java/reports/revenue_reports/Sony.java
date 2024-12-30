package reports.revenue_reports;

public final class Sony implements RevenueReportGenerator {
    @Override
    public void generateRevenue() {
        System.out.println("Generate Sony Revenue");
    }
}
