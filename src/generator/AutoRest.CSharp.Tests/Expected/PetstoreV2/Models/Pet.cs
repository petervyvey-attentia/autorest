// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.PetstoreV2.Models
{
    using Fixtures.PetstoreV2;
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;
    using System.Xml;
    using System.Xml.Linq;

    public partial class Pet
    {
        /// <summary>
        /// Initializes a new instance of the Pet class.
        /// </summary>
        public Pet()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Pet class.
        /// </summary>
        /// <param name="status">pet status in the store. Possible values
        /// include: 'available', 'pending', 'sold'</param>
        public Pet(string name, IList<string> photoUrls, long? id = default(long?), Category category = default(Category), IList<Tag> tags = default(IList<Tag>), byte[] sByteProperty = default(byte[]), System.DateTime? birthday = default(System.DateTime?), IDictionary<string, Category> dictionary = default(IDictionary<string, Category>), string status = default(string))
        {
            Id = id;
            Category = category;
            Name = name;
            PhotoUrls = photoUrls;
            Tags = tags;
            SByteProperty = sByteProperty;
            Birthday = birthday;
            Dictionary = dictionary;
            Status = status;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public long? Id { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "category")]
        public Category Category { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "photoUrls")]
        public IList<string> PhotoUrls { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "tags")]
        public IList<Tag> Tags { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "sByte")]
        public byte[] SByteProperty { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "birthday")]
        public System.DateTime? Birthday { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "dictionary")]
        public IDictionary<string, Category> Dictionary { get; set; }

        /// <summary>
        /// Gets or sets pet status in the store. Possible values include:
        /// 'available', 'pending', 'sold'
        /// </summary>
        [JsonProperty(PropertyName = "status")]
        public string Status { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Name == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Name");
            }
            if (PhotoUrls == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "PhotoUrls");
            }
        }
        /// <summary>
        /// Serializes the object to an XML node
        /// </summary>
        internal XElement XmlSerialize(XElement result)
        {
            if( null != Id )
            {
                result.Add(new XElement("id", Id) );
            }
            if( null != Category )
            {
                result.Add(Category.XmlSerialize(new XElement( "category" )));
            }
            if( null != Name )
            {
                result.Add(new XElement("name", Name) );
            }
            if( null != PhotoUrls )
            {
                var seq = new XElement("photoUrl");
                foreach( var value in PhotoUrls ){
                    seq.Add(new XElement( "photoUrl", value ) );
                }
                result.Add(seq);
            }
            if( null != Tags )
            {
                var seq = new XElement("tag");
                foreach( var value in Tags ){
                    seq.Add(value.XmlSerialize( new XElement( "tag") ) );
                }
                result.Add(seq);
            }
            if( null != SByteProperty )
            {
                result.Add(new XElement("sByte", SByteProperty) );
            }
            if( null != Birthday )
            {
                result.Add(new XElement("birthday", Birthday) );
            }
            if( null != Dictionary )
            {
                var dict = new XElement("dictionary");
                foreach( var key in Dictionary.Keys ) {
                    dict.Add(Dictionary[key].XmlSerialize(new XElement(key) ) );
                }
                result.Add(dict);
            }
            if( null != Status )
            {
                result.Add(new XElement("status", Status) );
            }
            return result;
        }
        /// <summary>
        /// Deserializes an XML node to an instance of Pet
        /// </summary>
        internal static Pet XmlDeserialize(string payload)
        {
            // deserialize to xml and use the overload to do the work
            return XmlDeserialize( XElement.Parse( payload ) );
        }
        internal static Pet XmlDeserialize(XElement payload)
        {
            var result = new Pet();
            var deserializeId = XmlSerialization.ToDeserializer(e => (long?)e);
            long? resultId;
            if (deserializeId(payload, "id", out resultId))
            {
                result.Id = resultId;
            }
            var deserializeCategory = XmlSerialization.ToDeserializer(e => Category.XmlDeserialize(e));
            Category resultCategory;
            if (deserializeCategory(payload, "category", out resultCategory))
            {
                result.Category = resultCategory;
            }
            var deserializeName = XmlSerialization.ToDeserializer(e => (string)e);
            string resultName;
            if (deserializeName(payload, "name", out resultName))
            {
                result.Name = resultName;
            }
            var deserializePhotoUrls = XmlSerialization.CreateListXmlDeserializer(XmlSerialization.ToDeserializer(e => (string)e), "photoUrl");
            IList<string> resultPhotoUrls;
            if (deserializePhotoUrls(payload, "photoUrl", out resultPhotoUrls))
            {
                result.PhotoUrls = resultPhotoUrls;
            }
            var deserializeTags = XmlSerialization.CreateListXmlDeserializer(XmlSerialization.ToDeserializer(e => Tag.XmlDeserialize(e)), "tag");
            IList<Tag> resultTags;
            if (deserializeTags(payload, "tag", out resultTags))
            {
                result.Tags = resultTags;
            }
            var deserializeSByteProperty = XmlSerialization.ToDeserializer(e => System.Convert.FromBase64String(e.Value));
            byte[] resultSByteProperty;
            if (deserializeSByteProperty(payload, "sByte", out resultSByteProperty))
            {
                result.SByteProperty = resultSByteProperty;
            }
            var deserializeBirthday = XmlSerialization.ToDeserializer(e => (System.DateTime?)e);
            System.DateTime? resultBirthday;
            if (deserializeBirthday(payload, "birthday", out resultBirthday))
            {
                result.Birthday = resultBirthday;
            }
            var deserializeDictionary = XmlSerialization.CreateDictionaryXmlDeserializer(XmlSerialization.ToDeserializer(e => Category.XmlDeserialize(e)));
            IDictionary<string, Category> resultDictionary;
            if (deserializeDictionary(payload, "dictionary", out resultDictionary))
            {
                result.Dictionary = resultDictionary;
            }
            var deserializeStatus = XmlSerialization.ToDeserializer(e => (string)e);
            string resultStatus;
            if (deserializeStatus(payload, "status", out resultStatus))
            {
                result.Status = resultStatus;
            }
            return result;
        }
    }
}
