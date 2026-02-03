export var IconDefault = L.Icon.extend({

    options: {
        iconUrl: 'marker-icon.png',
        iconRetinaUrl: 'marker-icon-2x.png',
        shadowUrl: 'marker-shadow.png',
        iconSize: [25, 41],
        iconAnchor: [12, 41],
        popupAnchor: [1, -34],
        tooltipAnchor: [16, -28],
        shadowSize: [41, 41]
    },

    _getIconUrl: function (name) {
        if (!IconDefault.imagePath) { // Deprecated, backwards-compatibility only
            var path = this._detectIconPath(name);
            // Compatible with webpack
            // Don't attach data url onto IconDefault.imagePath.
            // Just return it as it is.
            if (path.indexOf('data:image/') === 0) {
                return path;
            }
            IconDefault.imagePath = path
        }

        // @option imagePath: String
        // `Icon.Default` will try to auto-detect the location of the
        // blue icon images. If you are placing these images in a non-standard
        // way, set this option to point to the right path.
        return (this.options.imagePath || IconDefault.imagePath) + Icon.prototype._getIconUrl.call(this, name);
    },

    _detectIconPath: function (name) {
        var el = create$1('div', 'leaflet-default-marker-' + name, document.body);
        var path = getStyle(el, 'background-image') ||
            getStyle(el, 'backgroundImage'); // IE8

        document.body.removeChild(el);

        if (path === null || path.indexOf('url') !== 0) {
            path = '';
        } else {
            // Compatible with webpack
            path = path.replace(/^url\((["']?)(.+?)(marker-(icon|shadow)\.png)?\1\)/, '$2');
        }

        return path;
    }
});

L.LayerGroup.include({
    getLayerById: function (id) {
        // console.log(this.getLayers())
        for (let i in this._layers) {
            if (this._layers[i].id == id) {
                return this._layers[i];
            }
        }
    }
});