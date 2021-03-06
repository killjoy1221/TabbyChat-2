package mnm.mods.tabbychat.api.gui;

import java.util.List;

/**
 * The chat input is responsible for storing the chat to be sent before it gets
 * sent in a user friendly way. Seriously.. it's a wrapping text box.
 */
public interface ChatInput extends IGui {

    /**
     * Get the contents of the text field wrapped with the width.
     *
     * @return The wrapped lines
     */
    List<String> getWrappedLines();

    void setText(String text);

    String getText();
}
