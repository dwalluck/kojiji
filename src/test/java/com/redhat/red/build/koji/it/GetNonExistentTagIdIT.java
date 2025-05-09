/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.red.build.koji.it;

import com.redhat.red.build.koji.KojiClient;
import com.redhat.red.build.koji.KojiClientException;
import com.redhat.red.build.koji.model.xmlrpc.KojiTagInfo;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by jdcasey on 1/14/16.
 */
public class GetNonExistentTagIdIT
    extends AbstractIT
{

    @Test
    public void run()
            throws Exception
    {
        KojiClient client = newKojiClient();
        client.withKojiSession( (session ) -> {
            KojiTagInfo result;
            try
            {
                result = client.getTag( "missing-tag", session );

                assertThat( result, nullValue() );
            }
            catch ( KojiClientException e )
            {
                fail( e.getMessage() );
            }

            return null;
        });
    }
}
