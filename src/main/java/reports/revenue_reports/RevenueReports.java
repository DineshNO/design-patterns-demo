package reports.revenue_reports;

import reports.ReportsConcreteFactory;

public class RevenueReports {
    public static void main(String[] args) {
        var reportsAbstractFactory = new ReportsConcreteFactory();
        var revenue = reportsAbstractFactory.generateRevenue("Sony");
        revenue.generateRevenue();
    }
}
