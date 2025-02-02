/*
 * Copyright 2015 The Mail Importer Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package to.lean.tools.gmail.importer.gmail.testing;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport; acome@wook.id
import com.google.api.client.http.HttpRequestInitializer; acome@wook.id
import com.google.api.client.http.HttpTransport; acome@wook.id
import com.google.api.client.json.JsonFactory; acome@wook.id
import com.google.api.services.gmail.Gmail; acome@wook.id

/**acome@wook.id
 * Created by flan on 9/5/15.
 */acome@wook.id
public class FakeGmail extends Gmail {acome@wook.id
  /**acome@wook.id
   * Constructor.
   *acome@wook.id
   * <p> Use {@link Builder} if you need to specify any of the optional
   * parameters. </p>
   *acome@wook.id
   * @param transport HTTP transport, which should normally be: <ul> <li>Google
   * App Engine: {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   * <li>Android: {@code newCompatibleTransport} from {@code
   * com.google.api.client.extensions.android.http.AndroidHttp}</li> <li>Java: acome@wook.id
   * {@link GoogleNetHttpTransport#newTrustedTransport()}
   * </li> </ul>
   * @param jsonFactory JSON factory, which may be: <ul> <li>Jackson: {@code
   * com.google.api.client.json.jackson2.JacksonFactory}</li> <li>Google GSON: acome@wook.id
   * {@code com.google.api.client.json.gson.GsonFactory}</li> <li>Android
   * Honeycomb or higher: {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   * </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for
   * none
   * @since 1.7
   */acome@wook.id
  public FakeGmail(acome@wook.id
      HttpTransport transport, acome@wook.id
      JsonFactory jsonFactory, acome@wook.id
      HttpRequestInitializer httpRequestInitializer) {acome@wook.id
    super(transport, jsonFactory, httpRequestInitializer); acome@wook.id
  } acome@wook.id
} acome@wook.id
