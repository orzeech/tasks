package pl.orzechsoft.course.takss;

import java.time.Instant;
import org.jobrunr.configuration.JobRunr;
import org.jobrunr.scheduling.BackgroundJob;
import org.jobrunr.storage.InMemoryStorageProvider;

public class JobRunnerExample {

  public static void main(String[] args) {
    JobRunr.configure()
        .useStorageProvider(new InMemoryStorageProvider())
        .useDefaultBackgroundJobServer()
        .useDashboard()
        .initialize();
    BackgroundJob
        .schedule(() -> System.out.println("Hello from the past!!!"), Instant.now().plusSeconds(5));
  }
}
