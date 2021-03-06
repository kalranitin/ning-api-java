package com.ning.api.client.item;

import org.joda.time.DateTime;

/**
 * Shared base class for all types of content items.
 *
 * @author tatu
 */
public interface ContentItem<F extends Enum<F>,
    T extends ContentItem<F,T>>
{
    public Key<T> id();
    public DateTime getCreatedDate();
    public String getAuthor();

    /**
     * Method used by framework to link shared sub-resources into individual
     * value items.
     */
    public void injectSubResources(SubResources sr);
}
