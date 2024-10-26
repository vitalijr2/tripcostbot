package test.provider;

import io.github.vitalijr2.telegram.webhookbot.WebhookBot;
import java.io.Reader;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class TestServiceProvider implements WebhookBot {

  @Override
  public @NotNull Optional<String> processPayload(@NotNull Reader payloadReader) {
    return Optional.empty();
  }

}
