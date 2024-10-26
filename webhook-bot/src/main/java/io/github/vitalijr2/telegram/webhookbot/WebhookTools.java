package io.github.vitalijr2.telegram.webhookbot;

import java.util.ServiceLoader;

class WebhookTools {

  private WebhookTools() {
  }

  static WebhookBot getTelegramWebhookBot(Class<? extends WebhookBot> clazz) {
    return ServiceLoader.load(clazz).findFirst()
        .orElseThrow(() -> new IllegalStateException("Unable to find a TelegramWebhookBot implementation"));
  }

}
