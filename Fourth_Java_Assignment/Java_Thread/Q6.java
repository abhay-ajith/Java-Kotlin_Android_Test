package Java_Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q6 {
    public static void main(String[] args) {
        List<String> urls = new ArrayList<>();
        urls.add("http://example.com");
        urls.add("http://example.org");
        urls.add("http://example.net");

        ExecutorService executorService = Executors.newFixedThreadPool(urls.size());

        for (String url : urls) {
            executorService.execute(new WebCrawlerTask(url));
        }

        executorService.shutdown();
    }
}

class WebCrawlerTask implements Runnable {
    private final String url;

    public WebCrawlerTask(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        // Implement web crawling logic here
        System.out.println("Crawling URL: " + url);
        // Simulated web crawling process
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished crawling URL: " + url);
    }
}
