/**
  * Copyright 2016 Datamountaineer.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  **/

package com.datamountaineer.streamreactor.connect.jms.sink.writer.converters

import com.datamountaineer.connector.config.FormatType

object JMSMessageConverterFn {
  def apply(storedAs: FormatType): JMSMessageConverter = {
    storedAs match {
      case FormatType.AVRO => new AvroMessageConverter
      case FormatType.JSON => new JsonMessageConverter
      case FormatType.OBJECT => new ObjectMessageConverter
      case FormatType.BINARY => new ObjectMessageConverter
      case FormatType.TEXT => new JsonMessageConverter
      case FormatType.MAP => new MapMessageConverter
    }
  }
}
