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