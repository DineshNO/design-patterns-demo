package reports.provider_reports;

public sealed interface ProviderReportGenerator permits Sony, Universal {
    void generateMarkerShare();
}
