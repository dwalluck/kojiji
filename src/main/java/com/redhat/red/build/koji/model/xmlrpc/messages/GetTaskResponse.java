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
package com.redhat.red.build.koji.model.xmlrpc.messages;

import com.redhat.red.build.koji.model.xmlrpc.KojiTaskInfo;
import org.commonjava.rwx.anno.DataIndex;
import org.commonjava.rwx.anno.Response;

/**
 * Created by jdcasey on 1/29/16.
 */
@Response
public class GetTaskResponse
{
    @DataIndex( 0 )
    private KojiTaskInfo taskInfo;

    public GetTaskResponse( KojiTaskInfo taskInfo )
    {
        this.taskInfo = taskInfo;
    }

    public GetTaskResponse()
    {
    }

    public void setTaskInfo( KojiTaskInfo taskInfo )
    {
        this.taskInfo = taskInfo;
    }

    public KojiTaskInfo getTaskInfo()
    {
        return taskInfo;
    }
}
