// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.multitenancy.routing;

import de.bytefish.multitenancy.core.ThreadLocalStorage;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class TenantAwareRoutingSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return ThreadLocalStorage.getTenantName();
    }

}
